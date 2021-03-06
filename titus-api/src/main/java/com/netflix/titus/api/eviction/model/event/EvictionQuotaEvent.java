/*
 * Copyright 2018 Netflix, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.netflix.titus.api.eviction.model.event;

import java.util.Objects;

import com.netflix.titus.api.eviction.model.EvictionQuota;

public class EvictionQuotaEvent extends EvictionEvent {

    private final EvictionQuota quota;

    public EvictionQuotaEvent(EvictionQuota quota) {
        this.quota = quota;
    }

    public EvictionQuota getQuota() {
        return quota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvictionQuotaEvent that = (EvictionQuotaEvent) o;
        return Objects.equals(quota, that.quota);
    }

    @Override
    public int hashCode() {
        return Objects.hash(quota);
    }

    @Override
    public String toString() {
        return "EvictionQuotaEvent{" +
                "quota=" + quota +
                "} " + super.toString();
    }
}
