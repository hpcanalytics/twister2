//  Licensed under the Apache License, Version 2.0 (the "License");
//  you may not use this file except in compliance with the License.
//  You may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
//  Unless required by applicable law or agreed to in writing, software
//  distributed under the License is distributed on an "AS IS" BASIS,
//  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
//  See the License for the specific language governing permissions and
//  limitations under the License.
package edu.iu.dsc.tws.executor.comm;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

import edu.iu.dsc.tws.common.config.Config;
import edu.iu.dsc.tws.comms.api.TWSChannel;
import edu.iu.dsc.tws.comms.core.TaskPlan;
import edu.iu.dsc.tws.executor.EdgeGenerator;
import edu.iu.dsc.tws.task.api.IMessage;

public abstract class AbstractParallelOperation implements IParallelOperation {
  protected Config config;

  protected TWSChannel channel;

  protected Map<Integer, BlockingQueue<IMessage>> outMessages;

  protected TaskPlan taskPlan;

  protected EdgeGenerator edge;

  protected int partitionEdge;

  public AbstractParallelOperation(Config config, TWSChannel network, TaskPlan tPlan) {
    this.config = config;
    this.taskPlan = tPlan;
    this.channel = network;
    this.outMessages = new HashMap<>();
  }

  @Override
  public void send(int source, IMessage message) {
  }

  @Override
  public void send(int source, IMessage message, int dest) {
  }

  @Override
  public void register(int targetTask, BlockingQueue<IMessage> queue) {
    if (outMessages.containsKey(targetTask)) {
      throw new RuntimeException("Existing queue for target task");
    }
    outMessages.put(targetTask, queue);
  }

  @Override
  public void progress() {
  }
}
