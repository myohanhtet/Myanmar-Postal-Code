#Myanmar Post Code

###GET By Post Office
`GET localhost:8899/api/v1/postoffice/{postoffice}`
```
[
    {
        "id": 815,
        "stateRegion": "Yangon",
        "stateReqionMya": "ရန်ကုန်ဒေသကြီး",
        "srPCode": "MMR013",
        "district": "#N/A",
        "districtMya": "#N/A",
        "township": "Yangon",
        "townshipMya": "#N/A",
        "place": "Yangon",
        "postCode": "11181",
        "remark": "No Pcode data",
        "dpcode": "#N/A",
        "tspcode": "#N/A"
    },
    {
        "id": 821,
        "stateRegion": "Yangon",
        "stateReqionMya": "ရန်ကုန်ဒေသကြီး",
        "srPCode": "MMR013",
        "district": "Yangon (East)",
        "districtMya": "ရန်ကုန်(အရှေ့ပိုင်း)",
        "township": "MingalarTaungNyunt",
        "townshipMya": "မင်္ဂလာတောင်ညွန့်",
        "place": "Yangon Station",
        "postCode": "11222",
        "remark": null,
        "dpcode": "MMR013D002",
        "tspcode": "MMR013022"
    },
    {
        "id": 842,
        "stateRegion": "Mon",
        "stateReqionMya": "မွန်ပြည်နယ်",
        "srPCode": "MMR011",
        "district": "Thaton",
        "districtMya": "သထုံခရိုင်",
        "township": "Kyaikto",
        "townshipMya": "ကျိုက်ထို",
        "place": "Mayangone",
        "postCode": "12025",
        "remark": null,
        "dpcode": "MMR011D002",
        "tspcode": "MMR011009"
    }
]
```
###GET By Township
`GET localhost:8899/api/v1/township/{township}`
```
[
    {
        "id": 730,
        "stateRegion": "Ayeyarwady",
        "stateReqionMya": "ဧရာဝတီတိုင်းဒေသကြီး",
        "srPCode": "MMR017",
        "district": "Labutta",
        "districtMya": "လပွတ္တာခရိုင်",
        "township": "Mawlamyinegyun",
        "townshipMya": "မော်လမြိုင်ကျွန်း",
        "place": "Hlaingbone",
        "postCode": "10122",
        "remark": null,
        "dpcode": "MMR017D004",
        "tspcode": "MMR017018"
    },
    {
        "id": 765,
        "stateRegion": "Ayeyarwady",
        "stateReqionMya": "ဧရာဝတီတိုင်းဒေသကြီး",
        "srPCode": "MMR017",
        "district": "Labutta",
        "districtMya": "လပွတ္တာခရိုင်",
        "township": "Mawlamyinegyun",
        "townshipMya": "မော်လမြိုင်ကျွန်း",
        "place": "Mawlamyinegyun",
        "postCode": "10221",
        "remark": null,
        "dpcode": "MMR017D004",
        "tspcode": "MMR017018"
    },
    {
        "id": 766,
        "stateRegion": "Ayeyarwady",
        "stateReqionMya": "ဧရာဝတီတိုင်းဒေသကြီး",
        "srPCode": "MMR017",
        "district": "Labutta",
        "districtMya": "လပွတ္တာခရိုင်",
        "township": "Mawlamyinegyun",
        "townshipMya": "မော်လမြိုင်ကျွန်း",
        "place": "Kyeikpi",
        "postCode": "10223",
        "remark": null,
        "dpcode": "MMR017D004",
        "tspcode": "MMR017018"
    }
]
```