[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/bIZQaFcG)
# Lab3
## Class Characters
> ### variable
> > ### HP
> > 1. Double maxHp = เป็นเลือดที่มากที่สุด
> > 2. Double hp = เลือดที่มี
> > ### Mana
> > 1. Double mana = มานาที่มี
> > 2. Double maxMana = มานาที่มากที่สุด
> > ### Speed
> > 1. Double baseSpeed = ความเร็วพื้นฐาน
> > 2. Double maxBs = ความเร็วที่มากที่สุด
> > 3. Double speed = ความเร็วปกติ
> > ### Level
> > 1. int level = เลเวลตัวละคร
> > ### Equipment
> >  1. private shield equippedShield  = อุปกรณ์สวมใส่โล่
> >  2. private sword equippedSword = อุปกรณ์สวมใส่ดาบ
> ### method
> > 1. levelUp = เพิ่ม level ให้ตัวละคร
> > 2. constructor
> > 3. equipSword = ใส่ดาบให้ตัวละคร
> > 4. equipShield = ใส่โล่ให้ตัวละคร
> > 5. unequipSword = ถอดดาบ
> > 6. unequipShield = ถอดโล่
> > 7. Attack = โจมตีตัวละครอื่น
> > 8. beAttck = โดนตัวละครอื่นโจมตีเเล้วคำนวณเลือด
> > 9. CalDmg = คำนวณดาเมทที่โดน
> ### Getter
> > 1. getMaxHp = ส่งค่าเลือดที่มากที่สุดออกมา
> > 2. getHp = ส่งค่าเลือด
> > 3. getMaxMana =  ส่งค่ามานาที่มากที่สุดออกมา
> > 4. getMana = ส่งค่ามานา
> > 5. getBaseSpeed = ส่งค่าความเร็วที่มากที่สุดออกมา
> > 6. getMaxBs = ส่งค่าความเร็วพื้นฐานออกมา
> > 7. getSpeed = ส่งค่าความเร็ว
> > 8. getLevel = ส่ง Level ของตัวละคร
> > 9. getEquippedSword = ดูว่าตัวละครถือดาบอะไรอยู่
> > 10. getEquippedShield = ดูว่าตัวละครถือโล่อะไรอยู่


## Class Sword
> ### variable
> > 1. double baseDamage = ความเเรงพื้นฐาน
> > 2. double damage = ความเเรงพของดาบ
> > 3. int level = เลเวล
> ### method
> > 1. constructor
> > 2. levelUp = เพิ่ม Level ให้ดาบ
> > 3. updateDamage = อัปความเเรงพของดาบ
>  ### Getter
> > 1. getLevel  = ส่งเลเวลของดาบออกมา
> > 2. getDamage = ส่งดาเสจของดาบออกมา

## Class Shield
> ### variable
> > 1. double baseDefense = ค่าป้องกันพื้นฐาน
> > 2. double defense = ค่าป้องกันโดยปกติ
> > 3. int level = level โล่
> ### method
> > 1. constructor
> > 2. levelUp = ส่ง Level ของโล่
> > 3. updateDefense = อัปเดทค่าของการป้องกัน
>  ### Getter
> > 1. getLevel = ส่ง Level ของโล่ออกมา
> > 2. getDefense = ส่ง ค่าป้องกันของดาบออกมา
