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
package edu.iu.dsc.tws.comms.mpi;

import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import edu.iu.dsc.tws.common.config.Config;
import edu.iu.dsc.tws.comms.api.DataFlowOperation;
import edu.iu.dsc.tws.comms.api.Message;
import edu.iu.dsc.tws.comms.api.MessageDeSerializer;
import edu.iu.dsc.tws.comms.api.MessageReceiver;
import edu.iu.dsc.tws.comms.api.MessageSerializer;
import edu.iu.dsc.tws.comms.core.TaskPlan;
import edu.iu.dsc.tws.comms.routing.Routing;

public class MPIDataFlowReduce implements DataFlowOperation,
    MPIMessageListener, MPIMessageReleaseCallback  {
  private static final Logger LOG = Logger.getLogger(MPIDataFlowBroadcast.class.getName());


  public MPIDataFlowReduce(TWSMPIChannel channel) {
  }

  public Map<Integer, Routing> setupRouting() {
    return null;
  }

  @Override
  public void release(MPIMessage message) {

  }

  @Override
  public void onReceiveComplete(int id, int stream, MPIBuffer message) {

  }

  @Override
  public void onSendComplete(int id, int stream, MPIMessage message) {

  }

  @Override
  public void init(Config cfg, int task, TaskPlan plan, Set<Integer> srcs,
                   Set<Integer> dests, int messageStream, MessageReceiver rcvr,
                   MessageDeSerializer fmtr, MessageSerializer bldr) {
  }

  /**
   * Setup the receives and send sendBuffers
   */
  private void setupCommunication() {

  }

  @Override
  public void sendPartial(Message message) {
    throw new UnsupportedOperationException("partial messages not supported by reduce");
  }

  @Override
  public void finish() {
    throw new UnsupportedOperationException("partial messages not supported by reduce");
  }

  @Override
  public void sendComplete(Message message) {

  }

  @Override
  public void close() {

  }
}
