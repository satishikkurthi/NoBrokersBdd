Feature: Buy banglore flat
Scenario: Buying banglore flats
Given nobrokers   website   url
When i select banglore location
And flat type as 2bhk and 3bhk
Then it should display flats of banglore