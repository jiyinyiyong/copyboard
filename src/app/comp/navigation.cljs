
(ns app.comp.navigation
  (:require [hsl.core :refer [hsl]]
            [respo-ui.core :as ui]
            [respo-ui.colors :as colors]
            [respo.comp.space :refer [=<]]
            [respo.macros :refer [defcomp <> action-> span div]]))

(defcomp
 comp-navigation
 (logged-in? count-members)
 (div
  {:style (merge
           ui/row-parted
           {:justify-content :space-between,
            :padding "8px 16px",
            :font-size 16,
            :border-top (str "1px solid " (hsl 0 0 0 0.1)),
            :font-family ui/font-fancy})}
  (div
   {:on-click (action-> :router/change {:name :home}), :style {:cursor :pointer}}
   (<> span "Copyboard" nil))
  (div
   {:style {:cursor "pointer"}, :on-click (action-> :router/change {:name :profile})}
   (<> (if logged-in? "Me" "Guest"))
   (=< 8 nil)
   (<> count-members))))
