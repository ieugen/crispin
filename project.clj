(defproject crispin "0.3.6-SNAPSHOT"
  :description "A library for managing project-wide configuration."
  :url "https://github.com/dunaj-project/crispin"
  :license {:name "Eclipse Public License"
            :distribution :repo
            :comments "same as Clojure"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :scm {:name "git" :url "https://github.com/dunaj-project/crispin"}
  :signing {:gpg-key "AFA4E115"}
  :deploy-repositories [["clojars" {:creds :gpg}]]
  :dependencies [[cheshire "5.8.1"]
                 [org.clojure/clojure "1.10.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.10.0"]]}})
