(ns app.home
  (:require [helix.core :refer [defnc $ <>]]
            [helix.dom :as d]))
            
(defnc home []
  (<>
    (d/div 
      {:className "p-6"} 
      (d/p
        (d/a 
          {:href "https://github.com/lilactown/helix" 
           :className "text-blue-800 hover:text-underline"} "Helix")
        " is a thin ClojureScript wrapper around React.js"))))
