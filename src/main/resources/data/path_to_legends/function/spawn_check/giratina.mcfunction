execute as @s unless predicate path_to_legends:pedestal/giratina run function path_to_legends:pedestal_stat_set/0 
execute as @s if predicate path_to_legends:pedestal/giratina run function path_to_legends:pedestal_stat_set/1
execute as @s if predicate path_to_legends:pedestal/giratina run bedrockparticle cobblemon:giratina_chain @e[tag=ptl_giratina_spawn_place,sort=nearest]