node("master")
{
stage('prepare-gcp-pipeline')
{
/*sh 'echo "HELLO"'
sh 'gcloud init'
*/
bat "cmd /c dir"
}
}
