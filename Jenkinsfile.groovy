nodes
{
  node("jenkins")
{
stage('prepare-gcp-pipeline')
{
sh 'echo "HELLO"'
sh 'gcloud init'
//bat "cmd /c dir"
}
}
node("master")
{
stage('prepare-gcp-pipeline1')
{
bat "cmd /c dir"
}

}
}
