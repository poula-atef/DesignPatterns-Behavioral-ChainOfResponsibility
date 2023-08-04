# ايه هو البرنامج ده؟
- البرنامج ده هو عباره عن مثال لل Chain Of Responsibility Design Pattern باستخدام لغة java
# بنستخدم امتي ال Design Pattern ده؟
- لما يكون عندي اكتر من handler بيتعاملو مع نفس ال request (سواء انا عايزهم يتعاملو كلهم معاه ورا بعض بترتيب معين او واحد منهم فقط اللي يتعامل معاه بناء علي نوع ال request), فبستخدم ال design pattern ده عشان اخلي ال objects اللي من ال handlers دول يعرفو يتعاملو مع بعض بدون ما يكون في coupling زياده بينهم (عشان لو عوزت اغير ترتيبهم ماضطرش اغير في كود الربط بينهم) و ده عن طريق اني بعمل standarization لشكل ال handlers لانهم كلهم بيعملو implement لنفس ال interface او extend لنفس ال parent class
- البرنامج ده بيطبق ان كل ال handlers بيعملو implement لنفس ال interface و ان handler واحد بينهم هو اللي هيتعامل مع ال request بناء علي نوعه
# بيتكون من ايه البرنامج ده ؟
- ال package بتاعت ال handlers:
  - ال CarHandler و ده ال interface اللي ال handlers كلهم بيعملوله implement
  - ال MercedesHandler و ده بيتعامل مع ال requests اللي من نوع mercedes
  - ال HondaHandler و ده بيتعامل مع ال requests اللي من نوع honda
  - ال KiaHandler و ده بيتعامل مع ال requests اللي من نوع kia
