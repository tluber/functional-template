(ns exercise9)


(defn things [x]
  (def strin "Soy un String")
  (def vect "Soy un Vector")
  (def mapa "Soy un Map")
  (def deflt "Soy un default")
  
  
  (if (string? x)
    strin
    (if (vector? x)
      vect
      (if (map? x)
        mapa
        (if (number? x)
            deflt))))
)

