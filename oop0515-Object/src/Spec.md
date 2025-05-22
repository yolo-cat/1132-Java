製做一個寶可夢對戰小遊戲，程式架構如下:
    1. 生成寶可夢通用類別(Pokemon.java)
        1.1 寶可夢name
        1.2 寶可夢level
        1.3 寶可夢candy
        1.4 寶可夢attackPower
        1.5 寶可夢defencePower
    2. 生成寶可夢指定角色類別 
        2.1 Pickachu.java
            2.1.1 name 皮卡丘
            2.1.2 level 隨機 4-6 之間
            2.1.3 candy 預設 0
            2.1.4 attackPower 隨機 6-10 之間
            2.1.5 defencePower 隨機 1-5 之間
        2.2 Psyduck.java
            2.2.1 name 可達鴨
            2.2.2 level 隨機 4-6 之間
            2.2.3 candy 預設 0
            2.2.4 attackPower 隨機 1-5 之間
            2.2.5 defencePower 隨機 6-10 之間
        2.3 Charmander.java
            2.3.1 name 小火龍
            2.3.2 level 隨機 1-3 之間
            2.3.3 candy 預設 0
            2.3.4 attackPower 隨機 8-12 之間
            2.3.5 defencePower 隨機 1-3 之間
    4. 寶可夢對戰類別(Gym.java)
        4.1 寶可夢對戰方法
            4.1.1 參數: 寶可夢1, 寶可夢2, 寶可夢3...多組寶可夢對戰迴圈
        4.2 寶可夢對戰勝負規則
            4.2.1 level 高的獲勝
            4.2.2 level 相同時，以 attackPower - defencePower 判斷
            4.2.3 level 相同且 attackPower - defencePower 相同時，隨機決定勝負
        4.3 寶可夢對戰結果
    5. 寶可夢對戰主程式
        5.1 生成寶可夢
            5.1.1 選擇寶可夢數量
            5.1.1 選擇寶可夢角色
            5.1.2 生成寶可夢
            5.1.3 顯示寶可夢資訊
        5.2 寶可夢對戰
            5.3.1 顯示寶可夢對戰結果
            5.3.2 顯示贏家資訊
        5.3 顯示寶可夢對戰結束