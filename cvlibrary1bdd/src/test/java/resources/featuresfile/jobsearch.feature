Feature: Job Search Test



  @test
  Scenario Outline: Verify Job search result by defining specifications

    Given I am on homepage
    And I accept iFrame
    And I enter "<job title>","<location>","<distance>"
    And I click on more search option
    And I enter "<min salary>","<max salary>","<salary type>","<job type>"
    And I click on find job button
    Then I should able to see the search result "<search result>"

    Examples:
      | job title         | location | distance       | min salary | max salary | salary type | job type  | search result                              |
      | Developer         | Borehamwood| up to 5 mile | 50000      | 700000     | Per annum   | Permanent | Permanent Developer jobs in Borehamwood            |
      |   Developer       | Surrey     | up to 15 miles| 50000      | 70000      | Per annum   | Permanent | Permanent Developer jobs in Surrey |
      |  Developer         | Harrow    | up to 7 miles | 30000      | 50000       | Per annum   | Permanent  | Permanent Developer jobs in Harrow     |
      |Developer           |  Reading  |up to 15 miles |50000        |60000       |Per annum    |Permanent  |Permanent Developer jobs in Reading      |