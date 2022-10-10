
Narrative:
This story covers basic tests of signup

Scenario: Check errors

Given I open signup page
When I set day "20"
And I set year "1985"
And I set month "Январь"
And I set sex "Женщина"
And I close privacy message
And I click submit button
Then I see error
