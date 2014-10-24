package uk.co.flax.luwak.presearcher;

import java.util.Collection;
import java.util.Iterator;

import org.apache.lucene.search.Query;

/**
 * Copyright (c) 2014 Lemur Consulting Ltd.
 * <p/>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class PresearcherMatches implements Iterable<PresearcherMatch> {

    private final Query presearcherQuery;

    private final Collection<PresearcherMatch> matches;

    public PresearcherMatches(Query presearcherQuery, Collection<PresearcherMatch> matches) {
        this.presearcherQuery = presearcherQuery;
        this.matches = matches;
    }

    public Query getPresearcherQuery() {
        return presearcherQuery;
    }

    @Override
    public Iterator<PresearcherMatch> iterator() {
        return matches.iterator();
    }
}
