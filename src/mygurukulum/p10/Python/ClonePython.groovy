package mygurukulum.p10.Python

class ClonePython {
    def script

    ClonePython(script) {
        this.script = script
    }

    def execute() {
        script.git(branch: 'main', url: 'https://github.com/mygurukulam-p10/attendence-api.git', credentialsId: 'git-token')
    }
}
