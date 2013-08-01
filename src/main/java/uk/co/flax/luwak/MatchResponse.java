package uk.co.flax.luwak;

import java.util.List;

/**
 * Copyright (c) 2013 Lemur Consulting Ltd.
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

public class MatchResponse {

    private final String id;
    private final List<QueryMatch> matches;
    private final int qcount;
    private final MatchStats stats;

    public MatchResponse(String docId, List<QueryMatch> matches, int qcount, MatchStats matchStats) {
        this.id = docId;
        this.matches = matches;
        this.qcount = qcount;
        this.stats = matchStats;
    }

    public String docId() {
        return id;
    }

    public List<QueryMatch> matches() {
        return matches;
    }

    public int appliedQueryCount() {
        return qcount;
    }

    public MatchStats getMatchStats() {
        return stats;
    }
}