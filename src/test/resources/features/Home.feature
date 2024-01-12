@smoke
Feature: Retail Home Page

  Background: 
    Given User is on the retail home page

  @sidebare
  Scenario: Verify Shop by Departemtn Sidebar
    When User click on all section
    Then below options should display in shop by Department sidebar
      | Electronics | Computers | Smart Home | Sports | Automative |

  @Allsidebar
  Scenario Outline: Verify department sidebar options
    #When User click on All section
    And User on <department>
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department    | optionOne                      | optionTwo                |
      | 'Electronics' | TV & Video                     | Video Games              |
      | 'Computers'   | Accessories                    | Networking               |
      | 'Smart Home'  | Smart Home Lightning           | Plugs and Outlets        |
      | 'Sports'      | Athletic Clothing              | Exercise & Fitness       |
      | 'Automotive'  | Automative Parts & Accessories | MotorCycle & Powersports |
