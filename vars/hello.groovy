def call(Map config = [:]) {

sh "echo Hello ${config.name}., To day is ${config.dayOfWeek}. "

}
