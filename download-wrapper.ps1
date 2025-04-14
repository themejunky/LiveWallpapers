$wrapperJar = "gradle/wrapper/gradle-wrapper.jar"
$wrapperUrl = "https://raw.githubusercontent.com/gradle/gradle/v8.6.0/gradle/wrapper/gradle-wrapper.jar"

if (!(Test-Path $wrapperJar)) {
    Write-Host "Downloading Gradle wrapper JAR..."
    Invoke-WebRequest -Uri $wrapperUrl -OutFile $wrapperJar
    Write-Host "Downloaded Gradle wrapper JAR"
} 