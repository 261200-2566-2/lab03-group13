[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/bIZQaFcG)
# Lab3
## Class Characters
> ### variable
> > ### HP
> > 1. Double Max_hp = เป็นเลือดที่มากที่สุด
> > 2. Double hp = เลือดที่มี
> > ### Mana
> > 1. Double mana = มานาที่มี
> > 2. Double Max_mana = มานาที่มากที่สุด
> > ### Speed
> > 1. Double base_speed = ความเร็วพื้นฐาน
> > 2. Double Max_bs = ความเร็วที่มากที่สุด
> > 3. Double speed = ความเร็วปกติ
> > ### Level
> > 1. int Level = เลเวลตัวละคร
       >   private shield eequippedShield  = อุปกรณ์สวมใส่โล่
       >   private sword equippedSword = อุปกรณ์สวมใส่ดาบ
> ### method
> > 1. Levelup = เพิ่ม Level ให้ตัวละคร
> > 2. constructor
> > 3. equipSword = ใส่ดาบให้ตัวละคร
> > 4. equipShield = ใส่โล่ให้ตัวละคร
> > 5. unequipSword = ถอดดาบ
> > 6. unequipShield = ถอดโล่
> > 7. Attack = โจมตีตัวละครอื่น
> ### Getter
> > 8. getMaxHp = ส่งค่าเลือดที่มากที่สุดออกมา
> > 9. getHp = ส่งค่าเลือด
> > 10. getMaxMana =  ส่งค่ามานาที่มากที่สุดออกมา
> > 11. getMana = ส่งค่ามานา
> > 12. getBaseSpeed = ส่งค่าความเร็วที่มากที่สุดออกมา
> > 13. getMaxBs = ส่งค่าความเร็วพื้นฐานออกมา
> > 14. getSpeed = ส่งค่าความเร็ว
> > 15. getLevel = ส่ง Level ของตัวละคร
> > 16. getEquippedSword = ดูว่าตัวละครถือดาบอะไรอยู่
> > 17. getEquippedShield = ดูว่าตัวละครถือโล่อะไรอยู่


## Class sword
> ### variable
> > 1. double damage_base = ความเเรงพื้นฐาน
> > 2. double damage = ความเเรงพของดาบ
> > 3. int level = เลเวล
> ### method
> > 1. constructor
> > 2. Levelup = เพิ่ม Level ให้ดาบ
> > 3. updateDamage = อัปความเเรงพของดาบ
>  ### Getter
> > 1. getLevel  = ส่งเลเวลของดาบออกมา
> > 2. getDamage = ส่งดาเสจของดาบออกมา

## Class shield
> ### variable
> > 1. double base_defens = ค่าป้องกันพื้นฐาน
> > 2. double defense = ค่าป้องกันโดยปกติ
> > 3. int Level = Level โล่
> ### method
> > 1. constructor
> > 2. Levelup = ส่ง Level ของโล่
> > 3. updateDefense = อัปเดทค่าของการป้องกัน
>  ### Getter
> > 4. getLevel = ส่ง Level ของโล่ออกมา
> > 5. getDefense = ส่ง ค่าป้องกันของดาบออกมา