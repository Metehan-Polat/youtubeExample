package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.SearchYotube.SearchYotube;
import pom.base.Base;
import pom.js.JScr;
import pom.url.Url;

public class SearchYotubeStepdefs extends Base {

    Url url=new Url();

    SearchYotube searchYotube=new SearchYotube();

    @Given("Navigate to {string}")
    public void navigateTo(String arg0) {
        driver(arg0);
    }

    @When("Navigate to Url")
    public void navigateToUrl() {
        url.youtubeUrl(getDriver());
    }



    @Then("Click to search")
    public void clickToSearch() {
        searchYotube.searchClick(getDriver());
    }

    @And("Type most watched video in the search button")
    public void typeMostWatchedVideoInTheSearchButton() {
        searchYotube.searchWrite(getDriver(),getElement());
    }

    @And("Click to enter")
    public void clickToEnter() {
        searchYotube.enter(getDriver());
    }

    @And("click the first video in the options")
    public void clickTheFirstVideoInTheOptions() {
        searchYotube.firstVideoClick(getDriver());
    }

    @And("come to comments")
    public void comeToComments() {


        searchYotube.firstcommentlook(getDriver(),getElement());
    }



    @And("Close")
    public void close() {
    quitMethod();
    }
}
