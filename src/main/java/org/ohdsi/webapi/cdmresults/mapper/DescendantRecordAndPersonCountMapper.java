/*
 *
 * Copyright 2017 Observational Health Data Sciences and Informatics
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
 *
 */
package org.ohdsi.webapi.cdmresults.mapper;

import org.ohdsi.webapi.cdmresults.DescendantRecordAndPersonCount;
import org.ohdsi.webapi.cdmresults.DescendantRecordCount;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DescendantRecordAndPersonCountMapper extends BaseRecordCountMapper<DescendantRecordAndPersonCount> {

	public DescendantRecordAndPersonCount mapRow(ResultSet rs)
			throws SQLException {
		DescendantRecordAndPersonCount result = super.mapRow(rs);
		result.setPersonCount(rs.getLong("person_count"));
		result.setDescendantPersonCount(rs.getLong("descendant_person_count"));
		return result;
	}

	protected DescendantRecordAndPersonCount getResultObject() {
		return new DescendantRecordAndPersonCount();
	}
}