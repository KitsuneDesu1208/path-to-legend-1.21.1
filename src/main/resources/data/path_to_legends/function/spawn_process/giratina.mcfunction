effect give @a[distance=..10] minecraft:darkness 5 10 true
effect give @a[distance=..10] minecraft:slowness 3 10 true
title @a[distance=..10] times 3s 7s 3s
title @a[distance=..10] actionbar "You felt some unknown preasure..."
execute at @e[tag=ptl_giratina_spawn_place,sort=nearest] positioned ^ ^ ^ run bedrockparticle cobblemon:giratina_smoke minecraft:overworld ~ ~ ~
scoreboard players set @s ptl_timer 10
function path_to_legends:pedestal_stat_set/2