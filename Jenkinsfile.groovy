node("jenkins")
{
stage('prepare-gcp-pipeline')
{
sh 'echo "HELLO"'
sh 'gcloud init'

}
}
