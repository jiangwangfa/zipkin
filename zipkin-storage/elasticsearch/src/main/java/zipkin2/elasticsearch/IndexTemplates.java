/*
 * Copyright 2015-2019 The OpenZipkin Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package zipkin2.elasticsearch;

import com.google.auto.value.AutoValue;

@AutoValue
abstract class IndexTemplates {
  static Builder newBuilder() {
    return new zipkin2.elasticsearch.AutoValue_IndexTemplates.Builder();
  }

  abstract float version();

  abstract char indexTypeDelimiter();

  abstract String span();

  abstract String dependency();

  abstract String autocomplete();

  @AutoValue.Builder
  interface Builder {
    Builder version(float version);

    Builder indexTypeDelimiter(char indexTypeDelimiter);

    Builder span(String span);

    Builder dependency(String dependency);

    Builder autocomplete(String autocomplete);

    IndexTemplates build();
  }
}
