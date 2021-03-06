/*
 * Zulip REST API
 *
 * Powerful open source group chat 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing RealTimeEventsApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RealTimeEventsApiTests
    {
        private RealTimeEventsApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new RealTimeEventsApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of RealTimeEventsApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOf' RealTimeEventsApi
            //Assert.IsInstanceOf(typeof(RealTimeEventsApi), instance);
        }

        
        /// <summary>
        /// Test DeleteQueue
        /// </summary>
        [Test]
        public void DeleteQueueTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string queueId = null;
            //var response = instance.DeleteQueue(queueId);
            //Assert.IsInstanceOf(typeof(JsonSuccess), response, "response is JsonSuccess");
        }
        
        /// <summary>
        /// Test GetEvents
        /// </summary>
        [Test]
        public void GetEventsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string queueId = null;
            //int? lastEventId = null;
            //bool? dontBlock = null;
            //var response = instance.GetEvents(queueId, lastEventId, dontBlock);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test RealTimePost
        /// </summary>
        [Test]
        public void RealTimePostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<string> eventTypes = null;
            //List<List<string>> narrow = null;
            //bool? allPublicStreams = null;
            //instance.RealTimePost(eventTypes, narrow, allPublicStreams);
            
        }
        
        /// <summary>
        /// Test RegisterQueue
        /// </summary>
        [Test]
        public void RegisterQueueTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //bool? applyMarkdown = null;
            //bool? clientGravatar = null;
            //bool? slimPresence = null;
            //List<string> eventTypes = null;
            //bool? allPublicStreams = null;
            //bool? includeSubscribers = null;
            //Object clientCapabilities = null;
            //List<string> fetchEventTypes = null;
            //List<List<string>> narrow = null;
            //var response = instance.RegisterQueue(applyMarkdown, clientGravatar, slimPresence, eventTypes, allPublicStreams, includeSubscribers, clientCapabilities, fetchEventTypes, narrow);
            //Assert.IsInstanceOf(typeof(JsonSuccessBase), response, "response is JsonSuccessBase");
        }
        
        /// <summary>
        /// Test RestErrorHandling
        /// </summary>
        [Test]
        public void RestErrorHandlingTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.RestErrorHandling();
            
        }
        
    }

}
