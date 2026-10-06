#include <iostream>
#include <csignal>

void sighandle(int sig) {
    std::cout << "Farewell, cruel world.." << std::endl;
    std::exit(0);
}

int main() {
    std::signal(SIGINT, sighandle);
    while (true) {
    std::cout << "Hello, world!" << std::endl;
    }
    return 0;
}