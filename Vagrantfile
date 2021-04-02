#IMAGE_NAME = "ubuntu/xenial64" 
#NODE_NAME = "ubuntu-rabotka"

Vagrant.configure("2") do |config|
    config.vm.box = "ubuntu/focal64"
    #hostname виртуальной машины
    config.vm.hostname = "ubuntu-work"
    config.vm.define "work"

    config.vm.provider "virtualbox" do |v|
        v.memory = 4048
        v.cpus = 2
    end
    
    config.ssh.insert_key = true
    config.ssh.forward_agent = true

    #настройка сети (сетевой мост на втором интерфейсе) #192.168.31.120 #10.8.28.100
    config.vm.network "public_network", ip: "10.8.28.100", bridge: "en0: Wi-Fi (Wireless)"
    
    config.vm.provision "shell", inline: "echo Start"
    #ansible_local and ansible
    config.vm.provision "ansible_local" do |ansible|
        ansible.verbose = "v"
        ansible.playbook = "ansible/applications_deploymen.yml"
    end
end