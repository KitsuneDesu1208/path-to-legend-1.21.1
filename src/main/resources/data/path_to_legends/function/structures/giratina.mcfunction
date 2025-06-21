execute as @e[type=minecraft:armor_stand,tag=ptl_giratina_pedestal,scores={ptl_spawn_stat=0..1}] at @s run function path_to_legends:spawn_check/giratina
#you can find giratina spawn process in red chain function file
execute as @e[type=minecraft:armor_stand,tag=ptl_giratina_pedestal,scores={ptl_spawn_stat=2,ptl_timer=0}] at @s run function path_to_legends:spawn/giratina