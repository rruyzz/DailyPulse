import SwiftUI
import shared

struct ContentView: View {
    
    @State private var shouldOpenAbout = false
    @State private var shouldOpenSources = false
    
    var body: some View {
        let articlesScreen = ArticlesScreen(viewModel: .init())
        
        NavigationStack{
            articlesScreen
                .toolbar {
                    ToolbarItem {
                        Button {
                            shouldOpenSources = true
                        } label: {
                            Label("Sources", systemImage: "list.bullet.rectangle")
                                .labelStyle(.titleAndIcon)
                        }
                        .popover(isPresented: $shouldOpenSources) {
                            AboutScreen()
                        }
                    }
                
                }
        }.refreshable {
            articlesScreen.viewModel.articlesViewModel.getArticles(forceFetch: true)
        }
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
