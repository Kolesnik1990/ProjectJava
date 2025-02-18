package test.searchapartment;

import org.testng.annotations.Test;
import test.base.BaseTest;

import static constants.Constant.urls.REALT_HOME_PAGE;

public class SearchApartmentTest extends BaseTest {

    @Test
    public void checkIsRedirectListing () {
        basePage.open(REALT_HOME_PAGE);
        realtHomePage
                .enterCountRooms()
                .clickToFind();

        realtListingPage.checkCountCards();
    }
}
