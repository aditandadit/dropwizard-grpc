/**
 * Copyright 2017 Tristan Burch.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.lowtuna.dropwizard.grpc.metrics;

import com.codahale.metrics.Counter;
import com.codahale.metrics.Meter;
import com.codahale.metrics.Timer;
import com.google.common.cache.LoadingCache;
import io.grpc.Status;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MetricsContainer {
    private final Counter activeCallsCounter;
    private final Timer responseTimer;
    private final Meter streamMessagesSentMeter;
    private final Meter streamMessagesReceivedMeter;
    private final LoadingCache<Status, Meter> statusMeters;
}
