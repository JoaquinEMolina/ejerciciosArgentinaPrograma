SELECT * FROM tpintegrador.pronostico;

SELECT 
    j.nombreJugador,
    pa.nombreEquipo1,
    re.resultado as Resultado_pronosticado,
    pa.Ronda_idRonda,
    pa.idPartido
    
    
FROM 
	pronostico pr
JOIN 
	resultado re
ON pr.Resultado_idResultado = re.idResultado

JOIN partido pa
ON pr.Partido_idPartido = pa.idPartido

JOIN ronda ro
ON pr.Partido_Ronda_idRonda = ro.idRonda

JOIN jugador j
ON pr.Jugador_idJugador = j.idJugador

ORDER BY idpronostico


