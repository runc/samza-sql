/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.samza.sql.planner.common;

import org.apache.calcite.plan.RelOptCluster;
import org.apache.calcite.plan.RelTraitSet;
import org.apache.calcite.rel.RelNode;
import org.apache.calcite.rel.core.EquiJoin;
import org.apache.calcite.rel.core.JoinRelType;
import org.apache.calcite.rex.RexNode;
import org.apache.calcite.util.ImmutableIntList;
import org.apache.samza.sql.planner.physical.SamzaRel;

import java.util.Set;

public abstract class SamzaJoinRelBase extends EquiJoin implements SamzaRel {

  public SamzaJoinRelBase(RelOptCluster cluster, RelTraitSet traits, RelNode left, RelNode right, RexNode condition, ImmutableIntList leftKeys, ImmutableIntList rightKeys, JoinRelType joinType, Set<String> variablesStopped) {
    super(cluster, traits, left, right, condition, leftKeys, rightKeys, joinType, variablesStopped);
  }
}
