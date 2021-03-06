/**
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this file,
 * You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.mifosplatform.accounting.journalentry.service;

import java.util.Date;

import org.mifosplatform.accounting.journalentry.data.JournalEntryData;
import org.mifosplatform.infrastructure.core.service.Page;
import org.mifosplatform.portfolio.group.service.SearchParameters;

public interface JournalEntryReadPlatformService {

    JournalEntryData retrieveGLJournalEntryById(long glJournalEntryId);

    Page<JournalEntryData> retrieveAll(SearchParameters searchParameters, Long glAccountId, Boolean onlyManualEntries, Date fromDate,
            Date toDate, String transactionId);

}
