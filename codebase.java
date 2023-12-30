 html,
         body {
		             height: 100%;
				                 width: 100%;
							            padding: 0;
									                 margin: 0;
												         }
        @font-face{
	            font-family: "Segoe UI";
		                src: url('../fonts/segoeuil.ttf');
				             }
        .main-container {
		            height: 100%;
				                width: 100%;
						                   background-color: #1d539d;
								               color: white;
										                  padding-top: 6%;
												              box-sizing: border-box;
													                  overflow-y: auto;
															              overflow-x: hidden;
																                  font-family: "Segoe UI";
																		          }

        .cloud-image {
		            width: 1200px;
				               height: 250px;
						                   padding-bottom: 50px;
								               margin: auto;
										               }

        .success-text {
		            padding-bottom: 20px;
			                font-size: 62px;
					            line-height: 73px;
						            }

        .description {
		            font-size: 34px;
			                line-height: 40px;
					        }

        .next-steps-container {
		            padding-top: 50px;
			            }

        .next-steps-header {
		            font-size: 24px;
			                line-height: 28px;
					            padding-bottom: 25px;
						            }

        .next-steps-body {
		            display: flex;
				                 flex-direction: column;
						         }

        .step {
		            display: flex;
				                 margin: 7px 0px;
							             font-size: 15px;
								                 line-height: 21px;
										         }

        .step-icon {
		            height: 20px;
				                width: 20px;
						                   margin-right: 10px;
								           }
		
		.step-text a {
			            color: white;
					   			text-decoration: none;
								        }
		
		.step-text a:hover {
			            color: white;
					   			text-decoration:underline;
								        }

        .content {
		            box-sizing: border-box;
			                min-width: 700px;
					            max-width: 830px;
						                position: relative;
									              margin: auto;
											              }

        .tweet-container {
		            min-width: 30px;
			                min-height: 100px;
					            margin: 0 20px;
							                position: absolute;
										              left: -100px;
												                top: 110px;
														             }
        .content-body{
		            min-width: 400px;
			            }

        @media (max-width: 1024px) {
	            .main-container{
			                    padding-top: 1%;
					                }
		                .cloud-image {
					                padding-bottom: 30px;
							            }
				            .next-steps-container {
						                    padding-top: 30px;
								                }
					                .next-steps-header {
								                padding-bottom: 20px;
										            }
							            .success-text {
									                    font-size: 50px;
											                    line-height: 61px;
													                    padding-bottom: 10px;
															                }
								                .description {
											                font-size: 26px;
													                line-height: 30px;
															            }

										            .step {
												                    font-size: 12px;
														                    line-height: 18px;
																                }
											                .tweet-container {
														                top: 80px;
																                 }
													            .content{
															                    max-width: 630px;
																	                    min-width: 630px;
																			                }
														            }
