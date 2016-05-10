(ns tomatee.views)

(defn home-page []
  [:div.demo [:h2 "Test page"]])

(defn timer []
  [:div.row
   [:div.column
    [:div.timer
     [:div.timer-time "25:00"]]]])
