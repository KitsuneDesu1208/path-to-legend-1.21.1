scoreboard players set @s ptl_shiny_chance 0
execute as @s if predicate path_to_legends:shiny_chance run scoreboard players set @s ptl_shiny_chance 1
execute as @s[scores={ptl_shiny_chance=1}] at @e[tag=ptl_azelf_spawn_place,sort=nearest] run setblock ~ ~2 ~ minecraft:command_block{Command:"/pokespawnat ~ ~-2 ~ azelf lvl=50 shiny"}
execute as @s[scores={ptl_shiny_chance=0}] at @e[tag=ptl_azelf_spawn_place,sort=nearest] run setblock ~ ~2 ~ minecraft:command_block{Command:"/pokespawnat ~ ~-2 ~ azelf lvl=50"}
execute at @e[tag=ptl_azelf_spawn_place,sort=nearest] run setblock ~ ~4 ~ minecraft:command_block{Command:"/fill ~ ~ ~ ~ ~-2 ~ air"}
execute at @e[tag=ptl_azelf_spawn_place,sort=nearest] run setblock ~ ~3 ~ minecraft:redstone_block
particle minecraft:firework ~ ~1 ~ 1 1 1 1 25 force
data modify block ~ ~-1 ~ Items[0].id set value "path_to_legends:azelf_fang"
function path_to_legends:pedestal_stat_set/locked