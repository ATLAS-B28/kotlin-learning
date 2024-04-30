open class SmartDevice(val name: String, val category: String) {

    open val deviceType = ""
    var deviceStatus = "online"

    constructor(name: String, category: String, statusCode: Int): this(name, category) {
        deviceStatus = when(statusCode) {
            0 -> "offline"
            1 -> "online"
            else -> "unknown"
        }
    }
    /*var speakerVolume = 2 //this is the initial value
        //get() = field
        set(value) {
            if(value in 0..100) {
                field = value
            }
        }
*/
    fun turnOn() {
        println("Smart Device is on")
        turnOff()
    }

    fun turnOff() {
        println("Smart Device is off")
    }
}

class SmartTvDevice(deviceName: String, deviceCategory: String):
    SmartDevice(name = deviceName, category = deviceCategory) {
    private var speakerVolume = 2
        set(value) {
            if(value in 0..100) {
                field = value
            }
        }

    private var channelNumber = 1
        set(value) {
            if(value in 0..200) {
                field = value //if the value is between 0 and 100, set it to field
            }
        }

    fun increaseSpeakerVol() {
        speakerVolume++
        println("Speaker volume is: $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel number is: $channelNumber")
    }

}

class SmartTvDevice2(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceCategory) {
            override val deviceType = "SmartTv"

            var speakerVolume by Ranges(initialValue = 2, minValue = 0, maxValue = 100)
            var channelNumber by Ranges(initialValue = 1, minValue = 0, maxValue = 200)
        }

class SmartLightDevice2(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceCategory) {
            override val deviceType = "Smart Light"

            var brightnessLevel by Ranges(initialValue = 0, minValue = 0, maxValue = 100)
        }
class SmartLightDevice(deviceName: String, deviceCategory: String):
        SmartDevice(name = deviceName, category = deviceCategory) {

            private var brightnessLevel = 0
                set(value) {
                    if(value in 0..100) {
                        field = value
                    }
                }
            fun increaseBrightness() {
                brightnessLevel++
                println("Brightness level is: $brightnessLevel")
            }
        }

class SmartHome(private val smartTvDevice: SmartTvDevice,
                private val smartLightDevice: SmartLightDevice) {
    fun turnOnTv() {
        smartTvDevice.turnOn()
    }

    fun turnOffTv() {
        smartTvDevice.turnOff()
    }

    fun increaseTvVol() {
        smartTvDevice.increaseSpeakerVol()
    }

    fun changeTvChannelToNext() {
        smartTvDevice.nextChannel()
    }

    fun turnOnLight() {
        smartLightDevice.turnOn()
    }

    fun turnOffLight() {
        smartLightDevice.turnOff()
    }

    fun increaseLightBrightness() {
        smartLightDevice.increaseBrightness()
    }
}

fun main() {
    val classBasic = SmartDevice("Atari 2600", "Video Game")
    val smartTvDevice = SmartTvDevice("Samsung TV", "TV")
    val smartLightDevice = SmartLightDevice("Havells Light", "Light")
    val smartHome = SmartHome(smartTvDevice, smartLightDevice)

    val smartTvDevice2 = SmartTvDevice2("Samsung TV", "TV")
    val smartLightDevice2 = SmartLightDevice2("Havells Light", "Light")

    println("Device name is: ${classBasic.name}")
    println("Device category is: ${classBasic.category}")
    println("Device status is: ${classBasic.deviceStatus}")

  //  classBasic.speakerVolume = 50
  //  println("Speaker volume is: ${classBasic.speakerVolume}")

    classBasic.turnOn()

    smartTvDevice.deviceStatus = "offline"
    println("Device status is: ${smartTvDevice.deviceStatus}")
    smartTvDevice.increaseSpeakerVol()
    smartTvDevice.increaseSpeakerVol()

    smartTvDevice.nextChannel()
    smartTvDevice.nextChannel()

    smartLightDevice.deviceStatus = "online"
    println("Device status is: ${smartLightDevice.deviceStatus}")
    smartLightDevice.increaseBrightness()

    smartHome.turnOnTv()
    smartHome.turnOffTv()
    smartHome.increaseTvVol()
    smartHome.changeTvChannelToNext()

    smartHome.turnOnLight()
    smartHome.turnOffLight()
    smartHome.increaseLightBrightness()

    smartTvDevice2.deviceStatus = "offline"
    println("Device status is: ${smartTvDevice2.deviceStatus}")
    smartTvDevice2.speakerVolume = 50
    println("Speaker volume is: ${smartTvDevice2.speakerVolume}")
    smartTvDevice2.channelNumber = 100
    println("Channel number is: ${smartTvDevice2.channelNumber}")

    smartLightDevice2.deviceStatus = "online"
    println("Device status is: ${smartLightDevice2.deviceStatus}")
    smartLightDevice2.brightnessLevel = 50
    println("Brightness level is: ${smartLightDevice2.brightnessLevel}")
}