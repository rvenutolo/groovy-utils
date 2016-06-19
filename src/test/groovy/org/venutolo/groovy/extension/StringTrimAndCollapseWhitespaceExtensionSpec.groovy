/**
 * Copyright (C) 2016 Rick Venutolo (license@venutolo.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.venutolo.groovy.extension

import spock.lang.Specification

class StringTrimAndCollapseWhitespaceExtensionSpec extends Specification {

    def "Collapses inner whitespace"() {
        given:
        final String s = 'a \t\n\f\r b'
        expect:
        s.trimAndCollapseWhitespace() == 'a b'
    }

    def "Trims leading and trailing whitespace"() {
        given:
        final String s = ' \t\n\f\r ab \t\n\f\r '
        expect:
        s.trimAndCollapseWhitespace() == 'ab'
    }

}
