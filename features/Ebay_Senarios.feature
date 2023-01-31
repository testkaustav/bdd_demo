Feature: Ebay related Feature

  Scenario: Ebay Only Search
    Given : I am on the Ebay Home Page
    When I can Search Baby Products 'Baby Oil'
    Then I can see the Results need to Verify

  @K2 @taghooks @test
  Scenario: Advanced Search
    Given : I am on the Ebay Home Page
    When Click on the Advnaced Search
      | keyword | exclude | min | Max |
      | toy     | dotted  | 100 | 500 |

  @K3
  Scenario Outline: Multiple Link Validtion
    Given : I am on the Ebay Home Page
    When I Click on the '<link>'
    Then I need to Validate the '<url>' and the page '<title>'

    Examples: 
      | link        | url                                                                | title                |
      | Electronics | https://www.ebay.com/b/Electronics/bn_7000259124                   | Electronics products |
      | Fashion     | https://www.ebay.com/b/Clothing-Shoes-Accessories/11450/bn_1852545 | Clothing             |
      | Sports      | https://www.ebay.com/b/Sporting-Goods/888/bn_1865031               | Sporting Goods       |
