
SELECT ?sensor ?value 
WHERE { ?sensor is a ssn:SensingDevice .
?sensor ns1:hasUnit m3-lite:Cel .
?sensor ns1:madeObservation ?observation .
?observation ns2:observationResult ?results .
?results ns2:hasValue ?value .
}