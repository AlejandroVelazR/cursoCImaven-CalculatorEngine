@Library("cursoCImaven-CalculatorEngine") _
pipeline {
    agent { label "Ejemplo" }
    stages {
        stage("Ejemplo") {
            steps {
                holamundo(name:"Alejandro", dayOfWeek:"Monday")
            }
        }
    }
}