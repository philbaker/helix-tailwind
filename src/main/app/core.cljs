(ns app.core
  (:require [app.home :refer [home]]
            [app.counter :refer [counter]]
            [helix.core :refer [defnc $ <>]]
            [helix.dom :as d]
            ["react-dom/client" :as rdom]
            ["react-router-dom" :refer [BrowserRouter Route Routes Link]]))

(defnc header []
  (d/div {:className "px-6"}
     (d/h1 {:className "text-2xl mt-6"} 
           "Helix + Tailwind starter")))

(defnc app []
  (<>
    ($ BrowserRouter
       (d/nav {:className "px-6 space-x-4 mt-4"}
         ($ Link {:to "/" :relative "path" :className "text-blue-800 hover:underline"} "Home")
         ($ Link {:to "/counter" :relative "path" :className "text-blue-800 hover:underline"} "Counter"))
       ($ header)
       ($ Routes
          ($ Route {:path "/" :element [($ home {:key 1})]})
          ($ Route {:path "/counter" :element [($ counter {:key 2})]})))))

(defonce root (rdom/createRoot (js/document.getElementById "app")))
(defn ^:dev/after-load start []
  (.render root ($ app)))

(defn ^:export main []
  (start))
