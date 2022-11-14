package net.class101.automateduitest.Pages.CreatorCenter;

import java.util.Map;
import net.class101.automateduitest.Common.Properties.Account;
import net.class101.automateduitest.Common.Utils;

public class CreatorLoginPage {

    private static final Map<String, Account> accounts = Utils.getProperties().accounts;
    private static final String CREATOR_HAS_REVENUE_USER_ID = accounts.get("creatorHasRevenue").id;
    private static final String CREATOR_HAS_REVENUE_PASSWORD = accounts.get("creatorHasRevenue").pw;
    private static final String CREATOR_HAS_CLASS_USER_ID = accounts.get("creatorHasClass").id;
    private static final String CREATOR_HAS_CLASS_PASSWORD = accounts.get("creatorHasClass").pw;

}
