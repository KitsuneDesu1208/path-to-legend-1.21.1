scoreboard players set @s ptl_shiny_chance 0
execute as @s if predicate path_to_legends:shiny_chance run scoreboard players set @s ptl_shiny_chance 1
execute as @s[scores={ptl_shiny_chance=1}] at @e[tag=ptl_giratina_spawn_place,sort=nearest] run setblock ~ ~2 ~ minecraft:command_block{Command:"/pokespawnat ~ ~-2 ~ giratina lvl=70 shiny"}
execute as @s[scores={ptl_shiny_chance=0}] at @e[tag=ptl_giratina_spawn_place,sort=nearest] run setblock ~ ~2 ~ minecraft:command_block{Command:"/pokespawnat ~ ~-2 ~ giratina lvl=70"}
execute at @e[tag=ptl_giratina_spawn_place,sort=nearest] run setblock ~ ~4 ~ minecraft:command_block{Command:"/fill ~ ~ ~ ~ ~-2 ~ air"}
execute at @e[tag=ptl_giratina_spawn_place,sort=nearest] run setblock ~ ~3 ~ minecraft:redstone_block
function path_to_legends:pedestal_stat_set/locked