
Narrative:
This story covers basic tests of signup

Lifecycle:
Before:
Given I open signup page

Scenario: Check errors
!-- When I set day "<day>"
!-- And I set year "<year>"
!-- And I set month "<month>"
When I set date:
| month   | day | year |
| Декабрь | 10  | 1999 |
And I set sex "<sex>"
And I close privacy message
And I click submit button
Then I see error
Examples:
| month   | day | year | sex     |
| Январь  | 15  | 1985 | Женщина |
| Февраль | 2   | 1990 | Мужчина |
| Декабрь | 4   | 1939 | Женщина |

