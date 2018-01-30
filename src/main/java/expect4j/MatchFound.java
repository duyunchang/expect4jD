/*
 * Copyright (c) 2007 Justin Ryan
 * Copyright (c) 2013 Chris Verges <chris.verges@gmail.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you
 * may not use this file except in compliance with the License.  You may
 * obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.  See the License for the specific language governing
 * permissions and limitations under the License.
 */

package expect4j;

/**
 * Small bean to hold the results from a match. Maybe extends to hold
 * multiple match patterns. Existance of this object implies a match, to
 * show a no match use a null.
 *
 * @author Chris Verges
 * @author Justin Ryan
 */
public class MatchFound {
    int posEndOfMatch; // to know where to cut off the buffer
}
