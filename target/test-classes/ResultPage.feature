Feature: Result page functionalities

  Background:
    Given user is on argos home page website
    When user type nike on search box for the nike product
    And user click on search button
    Then user should be able to see nike products

    @category
    Scenario: search for the category products
      Given user is on nike products result page
      When user do select one of the category product
      Then user should be able to see selected category list of products

      @PriceRange
      Scenario: search by the price range products
        Given user is on nike products result page
        When user do select the price range ten and fifteen pounds of the products
        Then user should be able to see related price range products


      @DropDown
      Scenario: search by the relevance drop down category options
        Given user is on nike products result page
        When user click on the relevance drop down options
        And user select high to low relevance option
        Then user should be able to see high to low relevance products

      @Ratings
      Scenario: search the product select by customer rating
        Given user is on nike products result page
        When user select the four star rating products
        Then user should be able to see the four star rating products

      @Type
      Scenario: search the product by type
        Given user is on nike products result page
        When user select holdalls product from lists of types
        Then user should be able to see holdalls related products

       @ProductLists
       Scenario: select one product from the result page of nike
         Given user is on nike products result page
         When user do select one of the result page product
         And user do selected product add in to trolley
         And user do selected product go to trolley
         Then user should be able to see the selected product in his trolley