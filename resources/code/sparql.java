SELECT ?device
WHERE { ?device rdf:type base:Device .
?device base:hasService ?service .
?aspect rdf:type instance:Temperature  }